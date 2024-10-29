package com.entity.vo;

import com.entity.YizhuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 医嘱
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yizhu")
public class YizhuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "yizhu_name")
    private String yizhuName;


    /**
     * 患者
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 病情
     */

    @TableField(value = "yizhu_bingqing")
    private String yizhuBingqing;


    /**
     * 检查项目
     */

    @TableField(value = "jianchaxiangmu")
    private String jianchaxiangmu;


    /**
     * 检查结果
     */

    @TableField(value = "jianchajieguo")
    private String jianchajieguo;


    /**
     * 药单
     */

    @TableField(value = "yaodan_text")
    private String yaodanText;


    /**
     * 医嘱
     */

    @TableField(value = "yizhu_text")
    private String yizhuText;


    /**
     * 注意事项
     */

    @TableField(value = "zhuyishixiang")
    private String zhuyishixiang;


    /**
     * 病例附件
     */

    @TableField(value = "yizhu_file")
    private String yizhuFile;


    /**
     * 日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "yizhu_time")
    private Date yizhuTime;


    /**
     * 医生
     */

    @TableField(value = "yisheng_id")
    private Integer yishengId;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：标题
	 */
    public String getYizhuName() {
        return yizhuName;
    }


    /**
	 * 获取：标题
	 */

    public void setYizhuName(String yizhuName) {
        this.yizhuName = yizhuName;
    }
    /**
	 * 设置：患者
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：患者
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：病情
	 */
    public String getYizhuBingqing() {
        return yizhuBingqing;
    }


    /**
	 * 获取：病情
	 */

    public void setYizhuBingqing(String yizhuBingqing) {
        this.yizhuBingqing = yizhuBingqing;
    }
    /**
	 * 设置：检查项目
	 */
    public String getJianchaxiangmu() {
        return jianchaxiangmu;
    }


    /**
	 * 获取：检查项目
	 */

    public void setJianchaxiangmu(String jianchaxiangmu) {
        this.jianchaxiangmu = jianchaxiangmu;
    }
    /**
	 * 设置：检查结果
	 */
    public String getJianchajieguo() {
        return jianchajieguo;
    }


    /**
	 * 获取：检查结果
	 */

    public void setJianchajieguo(String jianchajieguo) {
        this.jianchajieguo = jianchajieguo;
    }
    /**
	 * 设置：药单
	 */
    public String getYaodanText() {
        return yaodanText;
    }


    /**
	 * 获取：药单
	 */

    public void setYaodanText(String yaodanText) {
        this.yaodanText = yaodanText;
    }
    /**
	 * 设置：医嘱
	 */
    public String getYizhuText() {
        return yizhuText;
    }


    /**
	 * 获取：医嘱
	 */

    public void setYizhuText(String yizhuText) {
        this.yizhuText = yizhuText;
    }
    /**
	 * 设置：注意事项
	 */
    public String getZhuyishixiang() {
        return zhuyishixiang;
    }


    /**
	 * 获取：注意事项
	 */

    public void setZhuyishixiang(String zhuyishixiang) {
        this.zhuyishixiang = zhuyishixiang;
    }
    /**
	 * 设置：病例附件
	 */
    public String getYizhuFile() {
        return yizhuFile;
    }


    /**
	 * 获取：病例附件
	 */

    public void setYizhuFile(String yizhuFile) {
        this.yizhuFile = yizhuFile;
    }
    /**
	 * 设置：日期
	 */
    public Date getYizhuTime() {
        return yizhuTime;
    }


    /**
	 * 获取：日期
	 */

    public void setYizhuTime(Date yizhuTime) {
        this.yizhuTime = yizhuTime;
    }
    /**
	 * 设置：医生
	 */
    public Integer getYishengId() {
        return yishengId;
    }


    /**
	 * 获取：医生
	 */

    public void setYishengId(Integer yishengId) {
        this.yishengId = yishengId;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
