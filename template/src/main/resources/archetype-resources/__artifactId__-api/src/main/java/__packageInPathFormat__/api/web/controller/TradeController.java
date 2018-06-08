package ${package}.api.web.controller;

import ${package}.common.enums.StatusCode;

import ${package}.api.web.reponse.TradeResponse;
import ${package}.biz.flow.TradeFlow;
import ${package}.biz.request.TradeRequest;
import ${package}.biz.result.TradeCreateResult;
import org.springframework.ext.common.aspect.Call;
import org.springframework.ext.common.setting.Context;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * 交易控制器
 *
 * @author ouliyuan
 * @date 2017-12-27
 */
@RestController
@RequestMapping("/api/trade")
public class TradeController {

    /** 订单流程 */
    @Resource
    private TradeFlow tradeFlow;

    @PostMapping("/buy")
    @ResponseBody
    @Call()
    public TradeResponse buy(@Valid @RequestBody TradeRequest trade, BindingResult bindingResult) {
        /** 处理参数验证错误 */
        if (bindingResult.hasErrors()) {
            // TODO
            return null;
        }

        /** 补充请求参数 */
        fillRequestIfNeed(trade);

        /** 交易创建 */
        TradeCreateResult result = tradeFlow.doCreate(trade);

        /** 输出转换 */
        return TradeResponse.valueOf(result);
    }

    private void fillRequestIfNeed(TradeRequest trade) {
        Long buyerId = Context.getThreadLocal("loginUserId");
        trade.setBuyerId(buyerId);
    }
}
