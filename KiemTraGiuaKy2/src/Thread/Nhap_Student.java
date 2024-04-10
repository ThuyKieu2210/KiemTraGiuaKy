package Thread;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Nhap_Student {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap thong tin sinh vien:");
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Ten: ");
        String name = scanner.nextLine();
        System.out.print("Dia chi: ");
        String address = scanner.nextLine();
        System.out.print("Ngay sinh (dd-MM-yyyy): ");
        String dayOfBirth = scanner.nextLine();
        
        saveStudentToXML(id, name, address, dayOfBirth);
    }

    private static void saveStudentToXML(String id, String name, String address, String dayOfBirth) {
        try {
            // Tạo một tài liệu XML mới
            Document doc = XML.createDocument();

            // Tạo phần tử <student> và các phần tử con của nó
            Element studentElement = doc.createElement("student");
            studentElement.setAttribute("id", id);

            Element nameElement = doc.createElement("name");
            nameElement.appendChild(doc.createTextNode(name));

            Element addressElement = doc.createElement("address");
            addressElement.appendChild(doc.createTextNode(address));

            Element dayOfBirthElement = doc.createElement("dayOfBirth");
            dayOfBirthElement.appendChild(doc.createTextNode(dayOfBirth));

            // Thêm các phần tử con vào phần tử <student>
            studentElement.appendChild(nameElement);
            studentElement.appendChild(addressElement);
            studentElement.appendChild(dayOfBirthElement);

            // Thêm phần tử <student> vào tài liệu XML
            doc.appendChild(studentElement);

            // Ghi tài liệu XML vào file
            FileWriter writer = new FileWriter("kq.xml");
            XML.transformDOMSourceToStreamResult(doc, writer);
            writer.close();

            System.out.println("Thong tin sinh vien da duoc luu vao file kq.xml.");
        } catch (ParserConfigurationException | TransformerException | IOException e) {
            e.printStackTrace();
        }
    }
}
