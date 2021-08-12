public class AlbumMedia {
    String ma, ten, ngayTao;
    HinhAnh[] dsHinhAnh;
    Video[] dsVideo;

    void nhapGT(String ma, String ten, String ngayTao) {
        // Gán giá trị
    }

    void themMedia(HinhAnh hinhAnh) {
        // Them hinhAnh vào dsHinhAnh
    }

    void themMedia(Video video) {
        // Them video vaod dsVideo
    }

    void suaTenMedia(String idMedia, String tenMoi) {
        // Duyet dsHinhAnh neu HinhAnh -> id = idMedia
        // Gán HinhAnh -> ten = tenMoi
    }

    HinhAnh[] timKiemHinhAnh(String ten) {
        HinhAnh[] dsKQ = null;
        // Duỵet dsHinhAnh neu HinhAnh -> ten = ten
        // thi Them HinhAnh vao dsKQ
        return dsKQ;
    }

    Video[] timKiemVideo(String ten) {
        Video[] dsKQ = null;
        // Duỵet dsVideo neu Video -> ten = ten
        // thi Them Video vao dsKQ
        return dsKQ;
    }

    void thuPhongHinhAnh(String id) {

    }

    void xoayHinhAnh(String id) {

    }

    void playVideo(String idVideo) {

    }

    void inTT() {

    }
}
