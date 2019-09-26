package com.jpassion.mvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jpassion.mvc.domain.Item;
import com.jpassion.mvc.domain.User;

@Controller
@RequestMapping("/helloworld")
public class MyController {

	// Automatic key generation for ModelMap attribute
	@RequestMapping(value = "/automaticKeyGeneration_ModelMap", method = RequestMethod.GET)
	public String handleRequest1(ModelMap modelMap) {

		// Note that catItems is List of Item type
		List<Item> cartItems = new ArrayList<Item>();
		cartItems.add(new Item("Apple", 10.0));
		cartItems.add(new Item("Orange", 20.0));

		User user = new User("Sang Shin");

		// This is the same as modelMap.addAttribute("itemList", cartItems);
		// "itemList" is automatically generated as a key
		modelMap.addAttribute(cartItems);

		// This is the same as modelMap.addAttribute("user", user);
		// "user" is automatically generated as a key
		modelMap.addAttribute(user);

		return "shoppingCart";
	}

	// Automatic key generation for ModelAndView attribute
	@RequestMapping(value = "/automaticKeyGeneration_ModelAndView", method = RequestMethod.GET)
	// Return type is ModelAndView
	// ModelAndView object is created inside the handler method
	public ModelAndView handleRequest2() {

		// Note that catItems is List of Item type
		List<Item> cartItems = new ArrayList<Item>();
		cartItems.add(new Item("Apple", 10.0));
		cartItems.add(new Item("Orange", 20.0));

		User user = new User("Sang Shin");

		// shoppingCart2 is logical view name
		ModelAndView mav = new ModelAndView("shoppingCart2");

		// This is the same as mav.addObject("itemList", cartItems);
		// itemList is automatically generated as a key
		mav.addObject(cartItems);

		// This is the same as mav.addObject("user", user);
		// user is automatically generated as a key
		mav.addObject(user);

		return mav;
	}

}