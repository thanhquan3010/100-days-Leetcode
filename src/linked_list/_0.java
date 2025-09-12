package linked_list;

import java.util.ArrayList;

public class _0 {
    /*
    Bài tập 1: Khởi tạo và Thêm phần tử
Khởi tạo một ArrayList có tên là danhSachMonHoc để lưu trữ các chuỗi (String).
Sử dụng phương thức add(E o), thêm các môn học sau vào danh sách: "Toán", "Lý", "Hóa".
In ra danh sách sau khi thêm.
     */
    public static void main(String[] args) {
        //Bài 1: Khởi tạo và thêm phần tử
        ArrayList<String> danhsachCongViec = new ArrayList<>();

        //Sử dụng add để thêm vào
        danhsachCongViec.add("Toan");
        danhsachCongViec.add(1, "Hoa");
        danhsachCongViec.add("Van");
//        for(String tmp : danhsachCongViec){
//            System.out.println(tmp); //toan hoa van
//        }

        //Sử dụng phương thức get(int index) để lấy và in ra tên môn học ở vị trí có chỉ số 2.
        String tmp = danhsachCongViec.get(2);
        System.out.println(tmp); //Van

        //Sử dụng phương thức remove(int index) để xóa môn học ở vị trí có chỉ số 0.
        danhsachCongViec.remove(2);
//        for (String i : danhsachCongViec) {
//            System.out.println(i); //toan hoa
//        }

        //Sử dụng phương thức size() để in ra số lượng môn học hiện có trong danh sách.
        System.out.println(danhsachCongViec.size());
        danhsachCongViec.trimToSize();

        //Sử dụng phương thức toArray() để chuyển ArrayList thành một mảng Object[].
        Object[] mangMonHoc = danhsachCongViec.toArray();
        for(Object i : mangMonHoc ) {
            System.out.println(i);
        }
        // --- Bài tập 5: Xóa toàn bộ danh sách ---
//        danhsachCongViec.clear();

    }
}
