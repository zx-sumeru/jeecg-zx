package org.jeecgframework.web.superquery.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;

/**   
 * @Title: Entity
 * @Description: 字段配置
 * @author onlineGenerator
 * @date 2017-12-04 18:10:18
 * @version V1.0   
 *
 */
@Entity
@Table(name = "super_query_field", schema = "")
@SuppressWarnings("serial")
public class SuperQueryFieldEntity implements java.io.Serializable {
	/**主键*/
	private String id;
	/**创建人名称*/
	private String createName;
	/**创建人登录名称*/
	private String createBy;
	/**创建日期*/
	private java.util.Date createDate;
	/**更新人名称*/
	private String updateName;
	/**更新人登录名称*/
	private String updateBy;
	/**更新日期*/
	private java.util.Date updateDate;
	/**所属部门*/
	private String sysOrgCode;
	/**所属公司*/
	private String sysCompanyCode;
	/**序号*/
    @Excel(name="序号",width=15)
	private String seq;
	/**表名*/
    @Excel(name="表名",width=15)
	private String tableName;
	/**字段名*/
    @Excel(name="字段名",width=15)
	private String name;
	/**字段文本*/
    @Excel(name="字段文本",width=15)
	private String txt;
	/**字段类型*/
    @Excel(name="字段类型",width=15,dicCode="field_type")
	private String ctype;
	/**控件类型*/
    @Excel(name="控件类型",width=15,dicCode="s_type")
	private String stype;
	/**字典Table*/
    @Excel(name="字典Table",width=15)
	private String dictTable;
	/**字典Code*/
    @Excel(name="字典Code",width=15)
	private String dictCode;
	/**字典Text*/
    @Excel(name="字典Text",width=15)
	private String dictText;
	/**外键*/
	private String mainId;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主键
	 */
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	
	@Column(name ="ID",nullable=false,length=36)
	public String getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主键
	 */
	public void setId(String id){
		this.id = id;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人名称
	 */
	
	@Column(name ="CREATE_NAME",nullable=true,length=50)
	public String getCreateName(){
		return this.createName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人名称
	 */
	public void setCreateName(String createName){
		this.createName = createName;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人登录名称
	 */
	
	@Column(name ="CREATE_BY",nullable=true,length=50)
	public String getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人登录名称
	 */
	public void setCreateBy(String createBy){
		this.createBy = createBy;
	}
	
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  创建日期
	 */
	
	@Column(name ="CREATE_DATE",nullable=true,length=20)
	public java.util.Date getCreateDate(){
		return this.createDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  创建日期
	 */
	public void setCreateDate(java.util.Date createDate){
		this.createDate = createDate;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人名称
	 */
	
	@Column(name ="UPDATE_NAME",nullable=true,length=50)
	public String getUpdateName(){
		return this.updateName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人名称
	 */
	public void setUpdateName(String updateName){
		this.updateName = updateName;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人登录名称
	 */
	
	@Column(name ="UPDATE_BY",nullable=true,length=50)
	public String getUpdateBy(){
		return this.updateBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人登录名称
	 */
	public void setUpdateBy(String updateBy){
		this.updateBy = updateBy;
	}
	
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  更新日期
	 */
	
	@Column(name ="UPDATE_DATE",nullable=true,length=20)
	public java.util.Date getUpdateDate(){
		return this.updateDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  更新日期
	 */
	public void setUpdateDate(java.util.Date updateDate){
		this.updateDate = updateDate;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属部门
	 */
	
	@Column(name ="SYS_ORG_CODE",nullable=true,length=50)
	public String getSysOrgCode(){
		return this.sysOrgCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属部门
	 */
	public void setSysOrgCode(String sysOrgCode){
		this.sysOrgCode = sysOrgCode;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属公司
	 */
	
	@Column(name ="SYS_COMPANY_CODE",nullable=true,length=50)
	public String getSysCompanyCode(){
		return this.sysCompanyCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属公司
	 */
	public void setSysCompanyCode(String sysCompanyCode){
		this.sysCompanyCode = sysCompanyCode;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  序号
	 */
	
	@Column(name ="SEQ",nullable=true,length=32)
	public String getSeq(){
		return this.seq;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  序号
	 */
	public void setSeq(String seq){
		this.seq = seq;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  表名
	 */
	
	@Column(name ="TABLE_NAME",nullable=true,length=32)
	public String getTableName(){
		return this.tableName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  表名
	 */
	public void setTableName(String tableName){
		this.tableName = tableName;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  字段名
	 */
	
	@Column(name ="NAME",nullable=true,length=32)
	public String getName(){
		return this.name;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  字段名
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  字段文本
	 */
	
	@Column(name ="TXT",nullable=true,length=32)
	public String getTxt(){
		return this.txt;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  字段文本
	 */
	public void setTxt(String txt){
		this.txt = txt;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  字段类型
	 */
	
	@Column(name ="CTYPE",nullable=true,length=32)
	public String getCtype(){
		return this.ctype;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  字段类型
	 */
	public void setCtype(String ctype){
		this.ctype = ctype;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  控件类型
	 */
	
	@Column(name ="STYPE",nullable=true,length=32)
	public String getStype(){
		return this.stype;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  控件类型
	 */
	public void setStype(String stype){
		this.stype = stype;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  字典Table
	 */
	
	@Column(name ="DICT_TABLE",nullable=true,length=32)
	public String getDictTable(){
		return this.dictTable;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  字典Table
	 */
	public void setDictTable(String dictTable){
		this.dictTable = dictTable;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  字典Code
	 */
	
	@Column(name ="DICT_CODE",nullable=true,length=32)
	public String getDictCode(){
		return this.dictCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  字典Code
	 */
	public void setDictCode(String dictCode){
		this.dictCode = dictCode;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  字典Text
	 */
	
	@Column(name ="DICT_TEXT",nullable=true,length=32)
	public String getDictText(){
		return this.dictText;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  字典Text
	 */
	public void setDictText(String dictText){
		this.dictText = dictText;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  外键
	 */
	
	@Column(name ="MAIN_ID",nullable=true,length=32)
	public String getMainId(){
		return this.mainId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  外键
	 */
	public void setMainId(String mainId){
		this.mainId = mainId;
	}
	
}
