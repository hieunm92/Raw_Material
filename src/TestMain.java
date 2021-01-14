import java.time.LocalDate;
import java.util.Scanner;

public class TestMain {
    static ManageRawMaterial manageRawMaterial = new ManageRawMaterial();
    static Scanner scanner = new Scanner(System.in);
    static final String REGEX_BIRTHDAY_PRODUCT = "^[0-9]{4}(-[0-9]{2}){2}";

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
                    manageRawMaterial.writeFile();
                    break;
                case 4:
                    manageRawMaterial.readFile();
                    break;

                case 0:
                    System.exit(0);
                    break;
            }
        } while (choice != 0);
    }

    public static void addNewRawMaterial() {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Nhập mã sản phẩm");
        String id = scanner.nextLine();
        String day;
        do {
            System.out.println("Nhâp ngày kiểu yyyy-MM-dd");
            day = sc.nextLine();
        } while (!day.matches(REGEX_BIRTHDAY_PRODUCT));
        LocalDate manufacturingDate = LocalDate.parse(day);
        System.out.println("Nhập giá tiền");
        int cost = Integer.parseInt(scanner.nextLine());
        boolean isMeat = false;
        boolean isCrispFlour = false;
        do {
            System.out.println("Nhập tên nguyên liệu thêm mới");
            name = sc.nextLine();
            isMeat = name.equalsIgnoreCase("M");
            if (isMeat) {
                System.out.println("Nhập khối lượng thịt");
                double weight = Integer.parseInt(scanner.nextLine());
                RawMaterial rawMaterial = new Meat(id, name, manufacturingDate, cost, weight);
                manageRawMaterial.addNew(rawMaterial);
            }
            isCrispFlour = name.equalsIgnoreCase("C");
            if (isCrispFlour) {
                System.out.println("Nhập định lượng bột");
                int quantyti = Integer.parseInt(sc.nextLine());
                RawMaterial rawMaterial = new CrispyFlour(id, name, manufacturingDate, cost, quantyti);
                manageRawMaterial.addNew(rawMaterial);
            }
        } while (isMeat == false && isCrispFlour == false);

        System.err.println("----------------------------------------");
    }
}

