package com.example.minidaodemo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "tb_ccb_merchant")
public class CcbMerchant {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    private Integer id;

    /**
     * 停车场id
     */
    @Column(name = "PARK_ID")
    private Integer parkId;

    /**
     * 停车场名称
     */
    @Column(name = "PARK_NAME")
    private String parkName;

    /**
     * 商户类型。 1 线上商户， 2-线下商户
     */
    @Column(name = "MERFLAG")
    private Byte merflag;

    /**
     * 商户号
     */
    @Column(name = "MERCHANTID")
    private String merchantid;

    /**
     * 柜台号 商户类型为1时填写
     */
    @Column(name = "POSID")
    private String posid;

    /**
     * 终端编号1. 商户类型为2时填写
     */
    @Column(name = "TERMNO1")
    private String termno1;

    /**
     * 终端编号2. 商户类型为2时填写
     */
    @Column(name = "TERMNO2")
    private String termno2;

    /**
     * 分行号
     */
    @Column(name = "BRANCHID")
    private String branchid;

    /**
     * 二级商户代码
     */
    @Column(name = "SMERID")
    private String smerid;

    /**
     * 二级商户名称
     */
    @Column(name = "SMERNAME")
    private String smername;

    /**
     * 二级商户类别代码
     */
    @Column(name = "SMERTYPEID")
    private String smertypeid;

    /**
     * 二级商户类别名称
     */
    @Column(name = "SMERTYPE")
    private String smertype;

    @Column(name = "TRADECODE")
    private String tradecode;

    /**
     * 交易类型名称
     */
    @Column(name = "TRADENAME")
    private String tradename;

    /**
     * 商品类别代码
     */
    @Column(name = "SMEPROTYPE")
    private String smeprotype;

    /**
     * 商品类别名称
     */
    @Column(name = "PRONAME")
    private String proname;

    /**
     * 更新时间
     */
    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 商户公钥。注意：加密时取公钥后30位
     */
    @Column(name = "PUB_KEY")
    private String pubKey;

    /**
     * 获取主键
     *
     * @return ID - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取停车场id
     *
     * @return PARK_ID - 停车场id
     */
    public Integer getParkId() {
        return parkId;
    }

    /**
     * 设置停车场id
     *
     * @param parkId 停车场id
     */
    public void setParkId(Integer parkId) {
        this.parkId = parkId;
    }

    /**
     * 获取停车场名称
     *
     * @return PARK_NAME - 停车场名称
     */
    public String getParkName() {
        return parkName;
    }

    /**
     * 设置停车场名称
     *
     * @param parkName 停车场名称
     */
    public void setParkName(String parkName) {
        this.parkName = parkName == null ? null : parkName.trim();
    }

    /**
     * 获取商户类型。 1 线上商户， 2-线下商户
     *
     * @return MERFLAG - 商户类型。 1 线上商户， 2-线下商户
     */
    public Byte getMerflag() {
        return merflag;
    }

    /**
     * 设置商户类型。 1 线上商户， 2-线下商户
     *
     * @param merflag 商户类型。 1 线上商户， 2-线下商户
     */
    public void setMerflag(Byte merflag) {
        this.merflag = merflag;
    }

    /**
     * 获取商户号
     *
     * @return MERCHANTID - 商户号
     */
    public String getMerchantid() {
        return merchantid;
    }

    /**
     * 设置商户号
     *
     * @param merchantid 商户号
     */
    public void setMerchantid(String merchantid) {
        this.merchantid = merchantid == null ? null : merchantid.trim();
    }

    /**
     * 获取柜台号 商户类型为1时填写
     *
     * @return POSID - 柜台号 商户类型为1时填写
     */
    public String getPosid() {
        return posid;
    }

    /**
     * 设置柜台号 商户类型为1时填写
     *
     * @param posid 柜台号 商户类型为1时填写
     */
    public void setPosid(String posid) {
        this.posid = posid == null ? null : posid.trim();
    }

    /**
     * 获取终端编号1. 商户类型为2时填写
     *
     * @return TERMNO1 - 终端编号1. 商户类型为2时填写
     */
    public String getTermno1() {
        return termno1;
    }

    /**
     * 设置终端编号1. 商户类型为2时填写
     *
     * @param termno1 终端编号1. 商户类型为2时填写
     */
    public void setTermno1(String termno1) {
        this.termno1 = termno1 == null ? null : termno1.trim();
    }

    /**
     * 获取终端编号2. 商户类型为2时填写
     *
     * @return TERMNO2 - 终端编号2. 商户类型为2时填写
     */
    public String getTermno2() {
        return termno2;
    }

    /**
     * 设置终端编号2. 商户类型为2时填写
     *
     * @param termno2 终端编号2. 商户类型为2时填写
     */
    public void setTermno2(String termno2) {
        this.termno2 = termno2 == null ? null : termno2.trim();
    }

    /**
     * 获取分行号
     *
     * @return BRANCHID - 分行号
     */
    public String getBranchid() {
        return branchid;
    }

    /**
     * 设置分行号
     *
     * @param branchid 分行号
     */
    public void setBranchid(String branchid) {
        this.branchid = branchid == null ? null : branchid.trim();
    }

    /**
     * 获取二级商户代码
     *
     * @return SMERID - 二级商户代码
     */
    public String getSmerid() {
        return smerid;
    }

    /**
     * 设置二级商户代码
     *
     * @param smerid 二级商户代码
     */
    public void setSmerid(String smerid) {
        this.smerid = smerid == null ? null : smerid.trim();
    }

    /**
     * 获取二级商户名称
     *
     * @return SMERNAME - 二级商户名称
     */
    public String getSmername() {
        return smername;
    }

    /**
     * 设置二级商户名称
     *
     * @param smername 二级商户名称
     */
    public void setSmername(String smername) {
        this.smername = smername == null ? null : smername.trim();
    }

    /**
     * 获取二级商户类别代码
     *
     * @return SMERTYPEID - 二级商户类别代码
     */
    public String getSmertypeid() {
        return smertypeid;
    }

    /**
     * 设置二级商户类别代码
     *
     * @param smertypeid 二级商户类别代码
     */
    public void setSmertypeid(String smertypeid) {
        this.smertypeid = smertypeid == null ? null : smertypeid.trim();
    }

    /**
     * 获取二级商户类别名称
     *
     * @return SMERTYPE - 二级商户类别名称
     */
    public String getSmertype() {
        return smertype;
    }

    /**
     * 设置二级商户类别名称
     *
     * @param smertype 二级商户类别名称
     */
    public void setSmertype(String smertype) {
        this.smertype = smertype == null ? null : smertype.trim();
    }

    /**
     * @return TRADECODE
     */
    public String getTradecode() {
        return tradecode;
    }

    /**
     * @param tradecode
     */
    public void setTradecode(String tradecode) {
        this.tradecode = tradecode == null ? null : tradecode.trim();
    }

    /**
     * 获取交易类型名称
     *
     * @return TRADENAME - 交易类型名称
     */
    public String getTradename() {
        return tradename;
    }

    /**
     * 设置交易类型名称
     *
     * @param tradename 交易类型名称
     */
    public void setTradename(String tradename) {
        this.tradename = tradename == null ? null : tradename.trim();
    }

    /**
     * 获取商品类别代码
     *
     * @return SMEPROTYPE - 商品类别代码
     */
    public String getSmeprotype() {
        return smeprotype;
    }

    /**
     * 设置商品类别代码
     *
     * @param smeprotype 商品类别代码
     */
    public void setSmeprotype(String smeprotype) {
        this.smeprotype = smeprotype == null ? null : smeprotype.trim();
    }

    /**
     * 获取商品类别名称
     *
     * @return PRONAME - 商品类别名称
     */
    public String getProname() {
        return proname;
    }

    /**
     * 设置商品类别名称
     *
     * @param proname 商品类别名称
     */
    public void setProname(String proname) {
        this.proname = proname == null ? null : proname.trim();
    }

    /**
     * 获取更新时间
     *
     * @return UPDATE_TIME - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取商户公钥。注意：加密时取公钥后30位
     *
     * @return PUB_KEY - 商户公钥。注意：加密时取公钥后30位
     */
    public String getPubKey() {
        return pubKey;
    }

    /**
     * 设置商户公钥。注意：加密时取公钥后30位
     *
     * @param pubKey 商户公钥。注意：加密时取公钥后30位
     */
    public void setPubKey(String pubKey) {
        this.pubKey = pubKey == null ? null : pubKey.trim();
    }
}