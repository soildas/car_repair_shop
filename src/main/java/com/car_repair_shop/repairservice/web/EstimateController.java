package com.car_repair_shop.repairservice.web;

import com.car_repair_shop.repairservice.domain.Repair;
import com.car_repair_shop.repairservice.service.EstimateService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/estimate")
@RequiredArgsConstructor
@Slf4j
public class EstimateController {

    private final EstimateService estimateService;

    @GetMapping("/estimatesForm")
    public String estimatesForm(Model model) {
        List<Repair> repairs = estimateService.selectAll();
        model.addAttribute("repairs", repairs);

        return "estimate/estimatesForm";
    }

    @PostMapping("/estimatesResult")
    public String estimates(@RequestParam("checkedRepairs") List<Integer> checks,
                            Model model) {
        int sum = 0;
        List<Repair> repairs = new ArrayList<>();
        log.info("estimate.checks={}", checks);
        for (Integer check : checks) {
            if (check != null) {
                int price = estimateService.price(check);
                sum += price;
            }
            Repair repair = estimateService.selectOne(check);
            repairs.add(repair);
        }
        model.addAttribute("repairs", repairs);
        model.addAttribute("sum", sum);
        log.info("sum={}", sum);
        return "estimate/estimatesResult";
    }

    @GetMapping("/estimatesResult")
    public String estimateResultForm(Model model) {
        log.info("getMapping");
        return "estimate/estimatesResult";
    }

    @PostMapping("/estimatesForm")
    public String goEstimateForm() {
        log.info("postMapping");
        return "redirect:/estimate/estimatesForm";
    }
}
