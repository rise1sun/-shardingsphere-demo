import com.feng.WMSApplication;
import com.feng.entity.OrderConfigDO;
import com.feng.entity.OrderDO;
import com.feng.mapper.OrderConfigMapper;
import com.feng.mapper.OrderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
        order.setUserId(1);
        orderMapper.insert(order);
    }

}