package tinh_tien_dien;

 
public class a {
    public static void main(String[] args) {
        // Tổng tiền điện trong 1 phòng
        double tongTienDien = 353.0;
        // Số người ở và thời gian ở (theo số ngày)
        int soNguoi = 7;
        				///A,  B,    C,   D,     E,     F,    G
        				//th, quynh, vi,  uyen,  tú ,  thư, v.anh
        int[] thoiGianO = {14, 14, 14, 19, 23, 26, 26}; // Thời gian ở của từng người
 
        // Tính số ngày trong 1 tháng
        int soNgayTro ngThang = 30;
        // Tính tỷ lệ thời gian ở của từng người so với tổng thời gian ở của tất cả mọi người
        double[] tyLeThoiGianO = new double[soNguoi];
        int tongThoiGianO = 0;
        for (int i = 0; i < soNguoi; i++) {
            tongThoiGianO += thoiGianO[i];
        }
        for (int i = 0; i < soNguoi; i++) {
            tyLeThoiGianO[i] = thoiGianO[i] / (double) tongThoiGianO;
        }

        // Tính số tiền mỗi người cần đóng và in ra
        for (int i = 0; i < soNguoi; i++) {
            double tienNguoiI = tongTienDien * tyLeThoiGianO[i];
            System.out.println("Số tiền  người " + (char)('A' + i) + " phải đóng: " + tienNguoiI + " VND");
 
        }

        // Tính và in ra tổng số tiền đã đóng của 7 người
        double tongTienDaDong = tinhTongTienDaDong(tyLeThoiGianO, tongTienDien);
        System.out.println("Tổng số tiền đã đóng của 7 người: " + tongTienDaDong + " VND");
    }

    // Hàm tính tổng số tiền đã đóng của 7 người
    private static double tinhTongTienDaDong(double[] tyLeThoiGianO, double tongTienDien) {
        double tongTien = 0;
        for (double tyLe : tyLeThoiGianO) {
            tongTien += tongTienDien * tyLe;
        }
        return tongTien;
    }
}

// A,B,C -> thiết, vi , quỳnh ( 2 tuần)
// D,E,F -> uyên, tuyết, thư ( 3 tuần)
// G -> vân anh ( 4 tuần)
