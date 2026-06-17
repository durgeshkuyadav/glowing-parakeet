package com.avyahome.crm.controller;
import org.springframework.web.bind.annotation.*;import java.util.*;
@RestController @RequestMapping("/dashboard") public class DashboardController{@GetMapping("/public") Map<String,Object> publicDashboard(){return Map.of("product","AVYA HOME CRM","portals",List.of("Admin Portal","Associate Portal"),"features",List.of("Projects","Plots","Bookings","Payments","Referral Tree","Commissions","Payouts","TDS","Reports","Audit Logs"));}}
