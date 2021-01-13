import java.time.LocalDate;
import java.util.Scanner;

public class TestMain {
        static ManageRawMaterial manageRawMaterial = new ManageRawMaterial();
        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int choice;
            do {
                System.out.println("=====Menu=====");
                System.out.println("1.Thêm nguyên liệu mới");
                System.out.println("2.Hiển thị tất cả nguyên liệu");
                System.out.println("3.Ghi File");
                System.out.println("4.Đọc File");
                System.out.println("0. Thoát");
                System.out.println("-----------------------------------");
                System.out.println("Xin chọn phương thức thực hiện");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Số lượng nguyên liệu muốn thêm mới");
                        int number = Integer.parseInt(scanner.nextLine());
                        for (int i = 0; i < number; i++) {
                            addNewRawMaterial();
                        }
                        break;
                    case 2:
                        manageRawMaterial.showAll();
                        break;
                    case 3:
                        break;
                    case 4:

                        break;

                    case 0:
                        System.exit(0);
                        break;
                }
            } while (true);
        }

        public static void addNewRawMaterial() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập tên nguyên liệu thêm mới");
            String name = sc.nextLine();
            System.out.println("Nhập mã sản phẩm");
            String id = scanner.nextLine();
            System.out.println("Nhâp ngày kiểu yyyy-MM-dd");
            String day = sc.nextLine();
            LocalDate localDate = LocalDate.parse(day);
            System.out.println("Nhập giá tiền");
            int cost = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập định lượng bột");
            int quantyti = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập khối lượng thịt");
            double weight = Integer.parseInt(scanner.nextLine());


            System.err.println("----------------------------------------");
        }
    }

