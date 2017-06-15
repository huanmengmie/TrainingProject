package pers.train.admin.dao;

import java.util.List;

import pers.train.admin.po.ArticleType;
import pers.train.admin.po.FriendLink;
import pers.train.common.base.dao.BaseMapper;

/**
 * 友情链接Mapper
 * 该接口 继承自BaseMapper接口
 * @author mingshan
 *
 */
public interface FriendLinkMapper extends BaseMapper<FriendLink> {

	//模糊查询
    List<FriendLink> selectByToken(String token);
	
    //批量删除
	int deleteBatch(FriendLink friendLink); 
}
