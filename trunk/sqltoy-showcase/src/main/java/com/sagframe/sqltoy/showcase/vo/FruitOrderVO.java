/**
 *@Generated by sagacity-quickvo 4.13
 */
package com.sagframe.sqltoy.showcase.vo;

import org.sagacity.sqltoy.config.annotation.SqlToyEntity;
import com.sagframe.sqltoy.showcase.vo.base.AbstractFruitOrderVO;

/**
 * @project sqltoy-showcase
 * @author zhongxuchen
 * @version 1.0.0
 * Table: sqltoy_fruit_order 	
 */
@SqlToyEntity
public class FruitOrderVO extends AbstractFruitOrderVO {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3517929707551091083L;
	
	/** default constructor */
	public FruitOrderVO() {
		super();
	}
	
	/*---begin-constructor-area---don't-update-this-area--*/


	/** full constructor */
	public FruitOrderVO(String fruitName,Integer orderMonth,Long saleCount,Long saleAmt,Long totalAmt)
	{
		this.fruitName=fruitName;
		this.orderMonth=orderMonth;
		this.saleCount=saleCount;
		this.saleAmt=saleAmt;
		this.totalAmt=totalAmt;
	}

	/*---end-constructor-area---don't-update-this-area--*/
	
	/**
     *@todo vo columns to String
     */
    @Override
	public String toString() {
		return super.toString();
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	public FruitOrderVO clone() {
		try {
			return (FruitOrderVO) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
