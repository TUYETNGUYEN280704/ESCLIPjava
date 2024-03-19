package tinh_tien_dien;


public class b {
    public static void main(String[] args) {
        // Tổng tiền điện trong 1 phòng
        double tongTienDien = 353.0;

        // Số người ở và thời gian ở (theo số ngày)
        int soNguoi = 7;
        int[] thoiGianO = {14, 14, 14, 19, 23, 26, 26}; // Thời gian ở của từng người

        // Tính số ngày trong 1 tháng
        int soNgayTrongThang = 30;

        // Tính số tiền mỗi người cần đóng
        double[] tienMoiNguoi = tinhTienMoiNguoi(tongTienDien, soNguoi, thoiGianO, soNgayTrongThang);

        // In ra số tiền mỗi người phải đóng và số tiền mỗi ngày
        for (int i = 0; i < soNguoi; i++) {
            System.out.println("Số tiền mỗi người " + (char)('A' + i) + " phải đóng: " + tienMoiNguoi[i] + " VND");
        }

        // Tính và in ra tổng số tiền đã đóng của tất cả mọi người
        double tongTienDaDong = tinhTongTienDaDong(tienMoiNguoi);
        System.out.println("Tổng số tiền đã đóng của tất cả mọi người: " + tongTienDaDong + " VND");
    }

    // Hàm tính số tiền mỗi người cần đóng
    private static double[] tinhTienMoiNguoi(double tongTienDien, int soNguoi, int[] thoiGianO, int soNgayTrongThang) {
        double[] tienMoiNguoi = new double[soNguoi];

        for (int i = 0; i < soNguoi; i++) {
            tienMoiNguoi[i] = (tongTienDien / soNguoi) * (thoiGianO[i] / (double)soNgayTrongThang);
        }

        return tienMoiNguoi;
    }

    // Hàm tính tổng số tiền đã đóng của tất cả mọi người
    private static double tinhTongTienDaDong(double[] tienMoiNguoi) {
        double tongTien = 0;
        for (double tien : tienMoiNguoi) {
            tongTien += tien;
        }
        return tongTien;
    }
}
