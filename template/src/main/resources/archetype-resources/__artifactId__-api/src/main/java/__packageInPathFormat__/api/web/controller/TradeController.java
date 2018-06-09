package ${package}.api.web.controller;

import ${package}.module.response.StatusCode;

import ${package}.biz.flow.TradeFlow;
import ${package}.module.request.TradeRequest;
import ${package}.module.response.TradeCreateResponse;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author suijie
 */
@RestController
@RequestMapping("/api/trade")
public class TradeController {

    /** 订单流程 */
    @Resource
    private TradeFlow tradeFlow;

    @PostMapping("/buy")
    @ResponseBody
    public TradeCreateResponse buy(@Valid @RequestBody TradeRequest trade, BindingResult bindingResult) {
        /** 处理参数验证错误 */
        if (bindingResult.hasErrors()) {
            // TODO
            return null;
        }

        /** 补充请求参数 */
        fillRequestIfNeed(trade);

        /** 交易创建 */
        TradeCreateResponse result = tradeFlow.doCreate(trade);

        /** 输出转换 */
        return TradeResponse.valueOf(result);
    }

    private void fillRequestIfNeed(TradeRequest trade) {

    }
}
