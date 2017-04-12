package com.gaussic.repository;

import com.gaussic.model.YmtAbroadFundAccountEntity;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by huwenjing on 2017/3/20.
 */
@Repository
public interface AbroadFundAccountRepository extends JpaRepository<YmtAbroadFundAccountEntity,String>{

}