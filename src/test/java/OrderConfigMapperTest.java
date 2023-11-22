import com.feng.WMSApplication;
import com.feng.entity.BarcodeDO;
import com.feng.entity.OrderConfigDO;
import com.feng.entity.OrderDO;
import com.feng.mapper.BarcodeMapper;
import com.feng.mapper.OrderConfigMapper;
import com.feng.mapper.OrderMapper;
import lombok.Data;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

/**
 *
 * @author jiangfeng
 * @date 2023/11/22
 */
// OrderConfigMapperTest.java

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WMSApplication.class)
public class OrderConfigMapperTest {

    @Autowired
    private OrderConfigMapper orderConfigMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private BarcodeMapper barcodeMapper;

    @Test
    public void testSelectById() {
        OrderConfigDO orderConfig = orderConfigMapper.selectById(1);
        System.out.println(orderConfig);
    }

    @Test
    public void testSelectById1() {
        OrderDO order = orderMapper.selectById(3);
        System.out.println(order);
    }

    @Test
    public void testSelectListByUserId() {
        List<OrderDO> orders = orderMapper.selectListByUserId(1);
        System.out.println(orders.size());
    }

    @Test
    public void testInsert() {
        OrderDO order = new OrderDO();
        order.setUserId(2);
        orderMapper.insert(order);
    }

    @Test
    public void testBarcodeBatchInsert() {
        for(int i = 11; i <50 ; i++) {
            BarcodeDO barcodeDO = new BarcodeDO();
            barcodeDO.setBarcode(20231122+i);
            barcodeDO.setDataSource("测试");
            barcodeDO.setSpec("电池");
            barcodeDO.setArea("高温库");
            barcodeDO.setStorage("GW-01-"+i);
            barcodeDO.setBarcodeStatus((byte) 1);
            barcodeDO.setMesProductionNumber("11");
            barcodeDO.setCustomerNumber("22");
            barcodeDO.setCreateTime(new Date());
            barcodeDO.setUpdateTime(new Date());
            barcodeMapper.insert(barcodeDO);
        }
    }


    @Test
    public void testSelectByBarcode() {
        BarcodeDO barcodeDO = barcodeMapper.selectById(1);
        System.out.println(barcodeDO);
    }

    @Test
    public void testSelectByBarcode1() {
        List<BarcodeDO> barcodeDOS = barcodeMapper.selectListByBarcode(20231123);
        System.out.println(barcodeDOS);
    }

    @Test
    public void testSelectByTime() {
        List<BarcodeDO> barcodeDOS = barcodeMapper.selectListByTime();
        System.out.println(barcodeDOS);
    }

    @Test
    public void testUpdate() {
        Boolean success = barcodeMapper.updateDataSource("更新");
        System.out.println(success);
    }


}