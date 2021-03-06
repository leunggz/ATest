package com.shirley.aTest.dao;

import java.util.List;

import com.shirley.aTest.entity.Replace;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 371683941@qq.com
 * @date 2019年8月14日 上午9:10:30
 */
public interface IReplaceDAO {
	public List<Replace> QueryReplaces(int currentPageNo, int pageSize, int id, String name);

	public int QueryReplaceCount(int id, String name);

	public Replace QueryReplaceById(int id);

	public Boolean AddReplace(Replace replace);

	public Boolean DeleteReplaces(List<Integer> ids);

	public Boolean UpdateReplace(Replace replace);

}
