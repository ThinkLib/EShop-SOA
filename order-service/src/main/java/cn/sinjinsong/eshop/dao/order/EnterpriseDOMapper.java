package cn.sinjinsong.eshop.dao.order;

import cn.sinjinsong.eshop.common.domain.entity.order.EnterpriseDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EnterpriseDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise
     *
     * @mbggenerated
     */
    int insert(EnterpriseDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise
     *
     * @mbggenerated
     */
    EnterpriseDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(EnterpriseDO record);
}