# language: pt
	# encoding: utf-8
	
	Funcionalidade: Fazer cadastro
		Cenário: Preencher dados no formulário do site
		Dado que o usuário está na página de cadastro do site "http://sampleapp.tricentis.com/101/app.php"
		Quando preenche os dados do formulário
		E clica em next para a aba Insurant Data
		Então deve preencher o formulário Insurant Data
		E clica em next para a aba Product Data
		Então deve preencher o formulário Product Data
		E clica em next para a aba Select Price Option
		Então deve preencher o formulário Select Price Option
		E clica em next para a aba Send Quote
		Então deve preencher o formulário Send Quote
		E clica em send
		Então deve verificar a mensagem "Sending e-mail success!"
		