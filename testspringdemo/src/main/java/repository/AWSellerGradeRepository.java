package repository;

import entity.po.AWSellerGradePo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.util.List;

/**
 * Created by huwenjing on 2017/4/7.
 */
public class AWSellerGradeRepository
{
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;

    static{
        try{
            reader    = Resources.getResourceAsReader("Configuration.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public AWSellerGradePo GetAWSellerGrade(String gradeId,Integer sellerId){
        SqlSession session = sqlSessionFactory.openSession();

        try {
            IAWSellerGradeOperation userOperation=session.getMapper(IAWSellerGradeOperation.class);
            return userOperation.selectGradeByGradeId(gradeId,sellerId);
        } finally {
            session.close();
        }

        //try {
        //    AWSellerGradePo sellerGrade = (AWSellerGradePo) session.selectOne("entity.po.ymt_awsellergradeMapper.selectGradeByGradeId", gradeId);
        //    return sellerGrade;
        //} finally {
        //    session.close();
        //}
    }

    public List<AWSellerGradePo> GetAWSellerGradeList(int sellerId){
        SqlSession session = sqlSessionFactory.openSession();

        try {
            IAWSellerGradeOperation userOperation=session.getMapper(IAWSellerGradeOperation.class);
            return userOperation.selectGradeListBySellerId(sellerId);
        } finally {
            session.close();
        }
    }

    public void AddGrade(AWSellerGradePo grade){
        SqlSession session = sqlSessionFactory.openSession();
        try{
            IAWSellerGradeOperation userOperation=session.getMapper(IAWSellerGradeOperation.class);
            userOperation.addGrade(grade);
            session.commit();
        }finally {
            session.close();
        }
    }
    public void updateGrade(AWSellerGradePo grade){
        SqlSession session = sqlSessionFactory.openSession();
        try{
            IAWSellerGradeOperation userOperation=session.getMapper(IAWSellerGradeOperation.class);
            userOperation.updateGrade(grade);
            session.commit();
        }finally {
            session.close();
        }
    }

    public void deleteGrade(String gradeId){
        SqlSession session = sqlSessionFactory.openSession();
        try{
            IAWSellerGradeOperation userOperation=session.getMapper(IAWSellerGradeOperation.class);
            userOperation.deleteGrade(gradeId);
            session.commit();
        }finally {
            session.close();
        }
    }
}
