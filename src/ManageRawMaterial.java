import java.util.ArrayList;
import java.util.List;

public class ManageRawMaterial {
    List<RawMaterial> list = new ArrayList<>();

    public void addNew(RawMaterial rawMaterial){
    list.add(rawMaterial);
    }

    public void showAll(){
        for (RawMaterial r:list) {
            System.out.println(r);
        }
    }
}
