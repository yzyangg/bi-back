package com.yzy.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yzy.springbootinit.model.entity.Chart;
import com.yzy.springbootinit.service.ChartService;
import com.yzy.springbootinit.mapper.ChartMapper;
import org.springframework.stereotype.Service;

/**
* @author Lenovo
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2023-06-29 19:27:45
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

}




