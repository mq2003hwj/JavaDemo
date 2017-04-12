package repository;

import entity.po.AWSellerGradePo;

import java.util.List;

/**
 * Created by huwenjing on 2017/4/11.
 */
public interface IAWSellerGradeOperation {

    public AWSellerGradePo selectGradeByGradeId(String gradeId,Integer sellerId);

    public List<AWSellerGradePo> selectGradeListBySellerId(int sellerId);

    public void addGrade(AWSellerGradePo grade);

    public void updateGrade(AWSellerGradePo grade);

    public void deleteGrade(String gradeId);
}
