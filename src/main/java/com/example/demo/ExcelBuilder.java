package com.example.demo;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

public class ExcelBuilder extends AbstractXlsxView {
    @Override
    protected void buildExcelDocument(Map<String, Object> model,
    		Workbook workbook,
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        String fileName = new String("サンプル.xlsx".getBytes("MS932"), "ISO-8859-1");
        response.setHeader("Content-Disposition", "attachment; filename=" + fileName);

        Sheet sheet = workbook.createSheet("excelTest");
        Row row = sheet.createRow(0);
        row.createCell(0).setCellValue("cellName0");
    }
}
