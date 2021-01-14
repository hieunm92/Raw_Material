import java.util.ArrayList;
import java.util.List;

public class ManageRawMaterial {
    private static final String FILE_NAME = "rawMaterial.dat";
    List<RawMaterial> list = new ArrayList<>();

    public void addNew(RawMaterial rawMaterial) {
        list.add(rawMaterial);
    }

    public void showAll() {
        for (RawMaterial r : list) {
            System.out.println(r);
        }
    }

    public void writeFile() {
        WriteAndRead.writeFile(list, FILE_NAME);
    }

    public void readFile() {
        list = (List<RawMaterial>) WriteAndRead.readFile(FILE_NAME);
        showAll();
    }

}
