
package com.ur.shoppr.listitem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ProductsModel {

    @SerializedName("discount")
    @Expose
    private Integer discount;
    @SerializedName("brands_filter_facet")
    @Expose
    private String brandsFilterFacet;
    @SerializedName("search_image")
    @Expose
    private String searchImage;
    @SerializedName("discounted_price")
    @Expose
    private Integer discountedPrice;
    @SerializedName("gender_from_cms")
    @Expose
    private String genderFromCms;
    @SerializedName("score")
    @Expose
    private Integer score;
    @SerializedName("sizes")
    @Expose
    private String sizes;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("product_additional_info")
    @Expose
    private String productAdditionalInfo;
    @SerializedName("stylename")
    @Expose
    private String stylename;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("style_group")
    @Expose
    private String styleGroup;
    @SerializedName("product")
    @Expose
    private String product;
    @SerializedName("dre_landing_page_url")
    @Expose
    private String dreLandingPageUrl;
    @SerializedName("global_attr_article_type")
    @Expose
    private String globalAttrArticleType;
    @SerializedName("isPersonalized")
    @Expose
    private Boolean isPersonalized;
    @SerializedName("global_attr_brand")
    @Expose
    private String globalAttrBrand;
    @SerializedName("visual_tag")
    @Expose
    private String visualTag;
    @SerializedName("global_attr_base_colour")
    @Expose
    private String globalAttrBaseColour;
    @SerializedName("style_store4_male_sort_field")
    @Expose
    private Integer styleStore4MaleSortField;
    @SerializedName("imageEntry_default")
    @Expose
    private String imageEntryDefault;
    @SerializedName("colour_variant")
    @Expose
    private Boolean colourVariant;
    @SerializedName("styleid")
    @Expose
    private Integer styleid;
    @SerializedName("allSkuForSizes")
    @Expose
    private List<String> allSkuForSizes = new ArrayList<String>();
    @SerializedName("global_attr_colour1")
    @Expose
    private String globalAttrColour1;
    @SerializedName("dre_discount_label")
    @Expose
    private String dreDiscountLabel;
    @SerializedName("discount_label")
    @Expose
    private String discountLabel;

    /**
     * 
     * @return
     *     The discount
     */
    public Integer getDiscount() {
        return discount;
    }

    /**
     * 
     * @param discount
     *     The discount
     */
    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    /**
     * 
     * @return
     *     The brandsFilterFacet
     */
    public String getBrandsFilterFacet() {
        return brandsFilterFacet;
    }

    /**
     * 
     * @param brandsFilterFacet
     *     The brands_filter_facet
     */
    public void setBrandsFilterFacet(String brandsFilterFacet) {
        this.brandsFilterFacet = brandsFilterFacet;
    }

    /**
     * 
     * @return
     *     The searchImage
     */
    public String getSearchImage() {
        return searchImage;
    }

    /**
     * 
     * @param searchImage
     *     The search_image
     */
    public void setSearchImage(String searchImage) {
        this.searchImage = searchImage;
    }

    /**
     * 
     * @return
     *     The discountedPrice
     */
    public Integer getDiscountedPrice() {
        return discountedPrice;
    }

    /**
     * 
     * @param discountedPrice
     *     The discounted_price
     */
    public void setDiscountedPrice(Integer discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    /**
     * 
     * @return
     *     The genderFromCms
     */
    public String getGenderFromCms() {
        return genderFromCms;
    }

    /**
     * 
     * @param genderFromCms
     *     The gender_from_cms
     */
    public void setGenderFromCms(String genderFromCms) {
        this.genderFromCms = genderFromCms;
    }

    /**
     * 
     * @return
     *     The score
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 
     * @param score
     *     The score
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 
     * @return
     *     The sizes
     */
    public String getSizes() {
        return sizes;
    }

    /**
     * 
     * @param sizes
     *     The sizes
     */
    public void setSizes(String sizes) {
        this.sizes = sizes;
    }

    /**
     * 
     * @return
     *     The price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     The productAdditionalInfo
     */
    public String getProductAdditionalInfo() {
        return productAdditionalInfo;
    }

    /**
     * 
     * @param productAdditionalInfo
     *     The product_additional_info
     */
    public void setProductAdditionalInfo(String productAdditionalInfo) {
        this.productAdditionalInfo = productAdditionalInfo;
    }

    /**
     * 
     * @return
     *     The stylename
     */
    public String getStylename() {
        return stylename;
    }

    /**
     * 
     * @param stylename
     *     The stylename
     */
    public void setStylename(String stylename) {
        this.stylename = stylename;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The styleGroup
     */
    public String getStyleGroup() {
        return styleGroup;
    }

    /**
     * 
     * @param styleGroup
     *     The style_group
     */
    public void setStyleGroup(String styleGroup) {
        this.styleGroup = styleGroup;
    }

    /**
     * 
     * @return
     *     The product
     */
    public String getProduct() {
        return product;
    }

    /**
     * 
     * @param product
     *     The product
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * 
     * @return
     *     The dreLandingPageUrl
     */
    public String getDreLandingPageUrl() {
        return dreLandingPageUrl;
    }

    /**
     * 
     * @param dreLandingPageUrl
     *     The dre_landing_page_url
     */
    public void setDreLandingPageUrl(String dreLandingPageUrl) {
        this.dreLandingPageUrl = dreLandingPageUrl;
    }

    /**
     * 
     * @return
     *     The globalAttrArticleType
     */
    public String getGlobalAttrArticleType() {
        return globalAttrArticleType;
    }

    /**
     * 
     * @param globalAttrArticleType
     *     The global_attr_article_type
     */
    public void setGlobalAttrArticleType(String globalAttrArticleType) {
        this.globalAttrArticleType = globalAttrArticleType;
    }

    /**
     * 
     * @return
     *     The isPersonalized
     */
    public Boolean getIsPersonalized() {
        return isPersonalized;
    }

    /**
     * 
     * @param isPersonalized
     *     The isPersonalized
     */
    public void setIsPersonalized(Boolean isPersonalized) {
        this.isPersonalized = isPersonalized;
    }

    /**
     * 
     * @return
     *     The globalAttrBrand
     */
    public String getGlobalAttrBrand() {
        return globalAttrBrand;
    }

    /**
     * 
     * @param globalAttrBrand
     *     The global_attr_brand
     */
    public void setGlobalAttrBrand(String globalAttrBrand) {
        this.globalAttrBrand = globalAttrBrand;
    }

    /**
     * 
     * @return
     *     The visualTag
     */
    public String getVisualTag() {
        return visualTag;
    }

    /**
     * 
     * @param visualTag
     *     The visual_tag
     */
    public void setVisualTag(String visualTag) {
        this.visualTag = visualTag;
    }

    /**
     * 
     * @return
     *     The globalAttrBaseColour
     */
    public String getGlobalAttrBaseColour() {
        return globalAttrBaseColour;
    }

    /**
     * 
     * @param globalAttrBaseColour
     *     The global_attr_base_colour
     */
    public void setGlobalAttrBaseColour(String globalAttrBaseColour) {
        this.globalAttrBaseColour = globalAttrBaseColour;
    }

    /**
     * 
     * @return
     *     The styleStore4MaleSortField
     */
    public Integer getStyleStore4MaleSortField() {
        return styleStore4MaleSortField;
    }

    /**
     * 
     * @param styleStore4MaleSortField
     *     The style_store4_male_sort_field
     */
    public void setStyleStore4MaleSortField(Integer styleStore4MaleSortField) {
        this.styleStore4MaleSortField = styleStore4MaleSortField;
    }

    /**
     * 
     * @return
     *     The imageEntryDefault
     */
    public String getImageEntryDefault() {
        return imageEntryDefault;
    }

    /**
     * 
     * @param imageEntryDefault
     *     The imageEntry_default
     */
    public void setImageEntryDefault(String imageEntryDefault) {
        this.imageEntryDefault = imageEntryDefault;
    }

    /**
     * 
     * @return
     *     The colourVariant
     */
    public Boolean getColourVariant() {
        return colourVariant;
    }

    /**
     * 
     * @param colourVariant
     *     The colour_variant
     */
    public void setColourVariant(Boolean colourVariant) {
        this.colourVariant = colourVariant;
    }

    /**
     * 
     * @return
     *     The styleid
     */
    public Integer getStyleid() {
        return styleid;
    }

    /**
     * 
     * @param styleid
     *     The styleid
     */
    public void setStyleid(Integer styleid) {
        this.styleid = styleid;
    }

    /**
     * 
     * @return
     *     The allSkuForSizes
     */
    public List<String> getAllSkuForSizes() {
        return allSkuForSizes;
    }

    /**
     * 
     * @param allSkuForSizes
     *     The allSkuForSizes
     */
    public void setAllSkuForSizes(List<String> allSkuForSizes) {
        this.allSkuForSizes = allSkuForSizes;
    }

    /**
     * 
     * @return
     *     The globalAttrColour1
     */
    public String getGlobalAttrColour1() {
        return globalAttrColour1;
    }

    /**
     * 
     * @param globalAttrColour1
     *     The global_attr_colour1
     */
    public void setGlobalAttrColour1(String globalAttrColour1) {
        this.globalAttrColour1 = globalAttrColour1;
    }

    /**
     * 
     * @return
     *     The dreDiscountLabel
     */
    public String getDreDiscountLabel() {
        return dreDiscountLabel;
    }

    /**
     * 
     * @param dreDiscountLabel
     *     The dre_discount_label
     */
    public void setDreDiscountLabel(String dreDiscountLabel) {
        this.dreDiscountLabel = dreDiscountLabel;
    }

    /**
     * 
     * @return
     *     The discountLabel
     */
    public String getDiscountLabel() {
        return discountLabel;
    }

    /**
     * 
     * @param discountLabel
     *     The discount_label
     */
    public void setDiscountLabel(String discountLabel) {
        this.discountLabel = discountLabel;
    }

}
