package linked_list;

import java.util.LinkedList;

public class _0_1 {
    public static void main(String[] args) {
        // --- Bài tập 1: Khởi tạo và Thêm phần tử ---
        LinkedList<String> danhSachCongViec = new LinkedList<>();

        danhSachCongViec.add("Hoc");
        danhSachCongViec.addLast("choi");
        danhSachCongViec.addFirst("di dao");
        for(String i : danhSachCongViec){
            System.out.println(i);
        }

        String tmp1 = danhSachCongViec.get(2);
        String tmp2 = danhSachCongViec.getFirst();
        String tmp3 = danhSachCongViec.getLast();
        System.out.println(tmp1);
        System.out.println(tmp2);
        System.out.println(tmp3);

        //kich thuoc
        System.out.println(danhSachCongViec.size()); //3
        //don dep
        danhSachCongViec.clear();
        System.out.println(danhSachCongViec.size()); //0

    }
}
