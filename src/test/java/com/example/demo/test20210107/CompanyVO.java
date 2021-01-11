package com.example.demo.test20210107;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "公司信息", description = "公司信息")
public class CompanyVO {

    @ApiModelProperty("公司id")
    private String id;
    @ApiModelProperty("公司名称")
    private String name;
    private Integer age;
}