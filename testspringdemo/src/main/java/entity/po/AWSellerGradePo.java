package entity.po;

import java.util.Date;

/**
 * Created by huwenjing on 2017/4/1.
 */
public class AWSellerGradePo {
    private String gradeId;
    private int sellerId;
    private String sellerLoginId;
    private String grade;
    private Date useDate;
    private Date createTime;
    private int action;


    public String getGradeId(){
        return gradeId;
    }

    public int getSellerId(){
        return sellerId;
    }

    public String getSellerLoginId(){
        return sellerLoginId;
    }

    public String getGrade(){
        return grade;
    }

    public int getAction(){
        return action;
    }

    public Date getUseDate() {
        return useDate;
    }

    public Date getCreateTime(){
        return createTime;
    }

    public void getGradeId(String gradeId){

        this.gradeId = gradeId;
    }

    public void getSellerId(int sellerId){
        this.sellerId = sellerId;
    }

    public void getSellerLoginId(String sellerLoginId){
        this.sellerLoginId = sellerLoginId;
    }

    public void getGrade(String grade){
        this.grade = grade;
    }

    public void getTotalCredit(int action){
        this.action = action;
    }

    public void getUseDate(Date useDate) {
        this.useDate = useDate;
    }

    public void getCreateTime(Date createTime){
        this.createTime = createTime;
    }

    public AWSellerGradePo()
    {
        gradeId = "123";
        sellerId = 3383;
        sellerLoginId="wesper";
        grade="A1";
        action=1;
        useDate= new Date(2017,1,1);
        createTime = new Date(2017,1,1);
    }

}
