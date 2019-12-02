package CaseStudyModule2.Task1.commons;

import CaseStudyModule2.Task1.Models.House;
import CaseStudyModule2.Task1.Models.Room;
import CaseStudyModule2.Task1.Models.Villa;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncWriteFileCSV {
    // Lưu ra mảng cách nhau bởi dấu phẩy
    private static final char DEFAULT_SEPARATOR = ',';
    //Định nghĩ mảng đc phân cách bởi dấu đóng kép
    private static final char DEFAULT_QUOTE= '"';
    //Đường dẫn để lưu file
    private static final String pathVilla="src/CaseStudyModule2/Task1/Library/abc.csv";

    private static String [] headerRecordvilla= new String[]{"Id","NameService","Area","RentalCost","NumberOfPeole","TypeRent"
            ,"RoomStandard","Conveninet","PoolArea","NumberOfFloor"};

    private static final String pathHouse="src/CaseStudyModule2/Task1/Library/abc.csv";

    private static String [] headerRecordhouse= new String[]{"Id","NameService","Area","RentalCost","NumberOfPeole","TypeRent"
            ,"RoomStandard","Conveninet","NumberOfFloor"};

    private static final String pathRoom="src/CaseStudyModule2/Task1/Library/abc.csv";

    private static String [] headerRecordroom= new String[]{"Id","NameService","Area","RentalCost","NumberOfPeole","TypeRent",
            "FreeService"};

    // Phương thức nhập Villa vào file CSV
    public static void WriteVillaToFileCSV(ArrayList<Villa> arrayList) {
        try(Writer writer = new FileWriter(pathVilla);
            CSVWriter csvWriter = new CSVWriter(writer,
                    CSVWriter.DEFAULT_SEPARATOR,
                    CSVWriter.DEFAULT_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordvilla);
            for(Villa villa: arrayList ){
                csvWriter.writeNext(new String[]{
                        villa.getID(), villa.getNameService(),
                        String.valueOf(villa.getArea()),
                        String.valueOf(villa.getRentalCost()),
                        String.valueOf(villa.getNumberOfPeople()),
                        String.valueOf(villa.getTypeRent()),
                    String.valueOf(villa.getRoomStandard()),
                        String.valueOf(villa.getConvenient()),
                    String.valueOf(villa.getPoolArea()),
                        String.valueOf(villa.getNumberOfFloors())
                });
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void WriteHouseToFileCSV(ArrayList<House> arrayList) {
        try(Writer writer = new FileWriter(pathVilla);
            CSVWriter csvWriter = new CSVWriter(writer,
                    CSVWriter.DEFAULT_SEPARATOR,
                    CSVWriter.DEFAULT_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordvilla);
            for(House house: arrayList ){
                csvWriter.writeNext(new String[]{
                        house.getID(), house.getNameService(),
                        String.valueOf(house.getArea()),
                        String.valueOf(house.getRentalCost()),
                        String.valueOf(house.getNumberOfPeople()),
                        String.valueOf(house.getTypeRent()),
                        String.valueOf(house.getRoomStandard()),
                        String.valueOf(house.getConvenient()),
                        String.valueOf(house.getNumberOfFloors())
                });
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void WriteRoomToFileCSV(ArrayList<Room> arrayList) {
        try(Writer writer = new FileWriter(pathVilla);
            CSVWriter csvWriter = new CSVWriter(writer,
                    CSVWriter.DEFAULT_SEPARATOR,
                    CSVWriter.DEFAULT_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordvilla);
            for(Room room: arrayList ){
                csvWriter.writeNext(new String[]{
                        room.getID(), room.getNameService(),
                        String.valueOf(room.getArea()),
                        String.valueOf(room.getRentalCost()),
                        String.valueOf(room.getNumberOfPeople()),
                        String.valueOf(room.getTypeRent()),
                        String.valueOf(room.getFreeService()),
                });
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

private static final int NUM_OF_LIFE_SKIP=1;
// PHƯƠNG THỨC LẤY LIST VILLA KHỎI CSV
    public static ArrayList<Villa> getVillaFromCSV(){

        // fix lỗi trong trường hợp chưa nhập Service thì nó sẽ k quăng lỗi ra.
        Path path = Paths.get(pathVilla);
        // nếu chưa có file Service thì tạo ra 1 file trống rồi hiển thị null
        if (!Files.exists(path)){
            try{
                Writer writer= new FileWriter(pathVilla);

            }catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Villa> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Villa.class);
        strategy.setColumnMapping(headerRecordvilla);

        CsvToBean<Villa> csvToBean= null;
        try{
            csvToBean = new CsvToBeanBuilder<Villa>(new FileReader(pathVilla))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LIFE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        }catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Villa>) csvToBean.parse();
    }
}
