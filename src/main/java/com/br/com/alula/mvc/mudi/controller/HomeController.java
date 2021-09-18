package com.br.com.alula.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.br.com.alula.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Xiaomi Redmi Note 10");
		pedido.setUrlDaImagem("https://m.media-amazon.com/images/I/61bD+2ZxGyS._AC_SL1500_.jpg");
		pedido.setUrlDoProduto(
				"https://www.amazon.com.br/Xiaomi-Redmi-Note-Vers%C3%A3o-global/dp/B08YFLGZB4?ref_=Oct_d_otopr_d_16243803011&pd_rd_w=lxOL0&pf_rd_p=32b1ddde-8c67-4d85-bbf2-2754a91fdba5&pf_rd_r=YKD1350069W440CK2RK7&pd_rd_r=beb4214a-b2bc-4f51-b32d-aaaf92cc8ea1&pd_rd_wg=3n1Kj&pd_rd_i=B08YFLGZB4");
		pedido.setDescricao("Xiaomi Redmi Note 10 4GB+64GB Versão global Onyx Gray");

		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);

		return "home";
	}
}
