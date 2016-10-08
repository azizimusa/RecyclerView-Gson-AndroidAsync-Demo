
package com.ur.shoppr.listitem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ResultsModel {

    @SerializedName("totalProductsCount")
    @Expose
    private Integer totalProductsCount;
//    @SerializedName("filters")
//    @Expose
//    private List<Filter> filters = new ArrayList<Filter>();
    @SerializedName("products")
    @Expose
    private List<ProductsModel> products = new ArrayList<ProductsModel>();

    /**
     * 
     * @return
     *     The totalProductsCount
     */
    public Integer getTotalProductsCount() {
        return totalProductsCount;
    }

    /**
     * 
     * @param totalProductsCount
     *     The totalProductsCount
     */
    public void setTotalProductsCount(Integer totalProductsCount) {
        this.totalProductsCount = totalProductsCount;
    }

    /**
     * 
     * @return
     *     The filters
     */
//    public List<Filter> getFilters() {
//        return filters;
//    }

    /**
     * 
     * @param filters
     *     The filters
     */
//    public void setFilters(List<Filter> filters) {
//        this.filters = filters;
//    }

    /**
     * 
     * @return
     *     The products
     */
    public List<ProductsModel> getProducts() {
        return products;
    }

    /**
     * 
     * @param products
     *     The products
     */
    public void setProducts(List<ProductsModel> products) {
        this.products = products;
    }

}
