package aht.company.service;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import aht.company.model.Employee;

@Service
public class CSVService {

	public void readCSV(String link) throws IOException {
		List<Employee> ls = new ArrayList<>();
		try (Reader reader = new FileReader("C:\\\\convert/"+link); CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);) {
			Iterable<CSVRecord> csvRecords = csvParser.getRecords();
			for (CSVRecord csvRecord : csvRecords) {
				Employee emp = new Employee();
				emp.setMnv(csvRecord.get(4));
				emp.setHoten(csvRecord.get(5));
				emp.setCa(csvRecord.get(7));
				emp.setRa(csvRecord.get(10));
				ls.add(emp);
			}
		}
		String name = ls.get(1).getMnv();
		int tong = 0;
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\convert/convert_"+link));
				CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("Ho ten", "Ngay", "gio den",
						"gio ve", "thoi gian lam ", "phut", "gio", "tien phat"));) {
			for (int i = 1; i < ls.size(); i++) {
				try {
					String a = ls.get(i).getCa();
					int h = Integer.parseInt(a.substring(0, 1));
					int m = Integer.parseInt(a.substring(2));
					 if(h<8) { h=8; m=0; }
					 
					int start = h * 60 + m;

					String b = ls.get(i).getRa();
					int hra = Integer.parseInt(b.substring(0, 2));
					int mra = Integer.parseInt(b.substring(3));
					
					if(hra>=18) { hra=18; mra=0; }
					 
					int end = hra * 60 + mra;

					int rs = end - start - 75;

					int phut = rs % 60;
					int gio = (rs - phut) / 60;
					System.out.println(hra);
					// tinh tien phat
					int phat = 0;
					if (496 < start && start < 510) {
						phat = 20;
					}
					if (511 <= start && start < 525) {
						phat = 30;
					}
					if (526 <= start && start < 540) {
						phat = 40;
					}
					if (541 <= start && start < 570) {
						phat = 50;
					}
					if (571 <= start && start < 600) {
						phat = 80;
					}
					if (601 <= start && start < 660) {
						phat = 100;
					}

					// tong tien phat theo nhan vien
					if (name.equals(ls.get(i).getMnv())) {
						tong += phat;

					} else {
						csvPrinter.printRecord("", "", "", "", "", "", "", tong);
						tong = 0;
						name = (ls.get(i).getMnv());
						if (name.equals(ls.get(i).getMnv())) {
							tong += phat;
						}
					}
					System.out.println(tong);
					csvPrinter.printRecord(ls.get(i).getMnv(), ls.get(i).getHoten(), ls.get(i).getCa(),
							ls.get(i).getRa(), rs, phut, gio, phat);
					csvPrinter.flush();

				} catch (Exception e) {
					// TODO: handle exception
				}

			}

		}
	}
}
