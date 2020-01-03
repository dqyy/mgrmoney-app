package com.uek.mgrmoney.entity;

import com.uek.mgrmoney.enumeratmtion.ProductStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/*为什么使用bigdecimal
 * java/c/c++ 都会遇到这样的问题，浮点类型的数据在计算机底层的存储伪随机数
 * 1/3 伪数，就是不准确，但是我们现在需求要完全精确
 *
 */
@Data
@NoArgsConstructor
public class Product implements Serializable {
    private String id;
    private String name;
    private BigDecimal startAmount;
    private BigDecimal stepAmount;
    private Integer lockupPeriod;
    private BigDecimal earningRate;
    private String remark;
    private Date createAt;
    private Date updateAt;
    private String createUser;
    private String updateUser;
    private String status;
    //为了产品状态安全考虑。我们使用productstatus枚举类型
    //所以我们从写set方法
    public void setStatus(ProductStatus ps){
        this.status=ps.name();
    }
}
