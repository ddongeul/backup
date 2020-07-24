package g.sns_test.Data;

public class CrewItem {
    private int cr_number;
    private String cr_name;
    private String cr_img;
    private String cr_location;
    private String cr_introduce;
    private String cr_work;


    public CrewItem(int number, String cr_name, String cr_img, String cr_location, String cr_introduce, String cr_work) {

        this.cr_number = number;
        this.cr_name = cr_name;
        this.cr_img = cr_img;
        this.cr_location = cr_location;
        this.cr_introduce = cr_introduce;
        this.cr_work=cr_work;

    }

    public int getNumber() {
        return cr_number;
    }

    public int setNumber() {
        return cr_number;
    }
}