package com.car_repair_shop.repairservice.web;

import com.car_repair_shop.repairservice.domain.Repair;
import com.car_repair_shop.repairservice.service.RepairService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/repair/repairs")
@RequiredArgsConstructor
@Slf4j
public class RepairController {
    private final RepairService repairService;

    @GetMapping()
    public String repairs(Model model) {
        List<Repair> repairs = repairService.selectAll();
        model.addAttribute("repairs", repairs);
        return "repair/repairs";
    }

    @GetMapping("/{repairId}")
    public String repair(@PathVariable int repairId, Model model) {
        Repair repair = repairService.selectOne(repairId);
        model.addAttribute("repair", repair);
        return "repair/repair";
    }

    @GetMapping("/add")
    public String addForm() {
        return "repair/addForm";
    }

    @PostMapping("/add")
    public String addRepair(@ModelAttribute Repair repair, RedirectAttributes redirectAttributes) {
        repairService.save(repair);
        redirectAttributes.addAttribute("repairId", repair.getId());
        return "redirect:/repair/repairs/{repairId}";
    }

    @GetMapping("/{repairId}/edit")
    public String editForm(@PathVariable int repairId, Model model) {
        Repair repair = repairService.selectOne(repairId);
        model.addAttribute("repair", repair);
        return "repair/editForm";
    }

    @PostMapping("/{repairId}/edit")
    public String editRepair(@PathVariable int repairId, @ModelAttribute Repair repair) {
        repairService.update(repairId, repair);
        return "redirect:/repair/repairs";
    }

    @RequestMapping("{repairId}/delete")
    public String delete(@PathVariable int repairId) {
        repairService.delete(repairId);
        return "redirect:/repair/repairs";
    }
}
