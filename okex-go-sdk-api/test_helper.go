package okex

/*
 Get a http client
*/

func GetDefaultConfig() *Config {
	var config Config

	// flt. 201812. For swap test env.
	config.Endpoint = "http://192.168.80.113:9300/"
	config.WSEndpoint = "ws://192.168.80.113:10442/"
	config.ApiKey = "bb57a1b3-6257-47ff-b06c-faafc4d28fad"
	config.SecretKey = "5CE31E70CD129F34B9E17C38534DDF90"

	// flt. 20190225. For swap test env only
	config.Endpoint = "http://192.168.80.113:9300/"
	config.ApiKey = "dffdc0f1-b1e0-462c-bb9c-68eb2d511c2e"
	config.SecretKey = "4DCAC40E3D01BA8AC76AA01583269669"

	////
	////// flt. 20190225.
	////// For future test env only. coinmainweb.new.docker.okex.com --> 192.168.80.97
	//config.Endpoint = "http://coinmainweb.new.docker.okex.com/"
	//config.ApiKey = "db2a8f85-afa2-48ca-b9f7-5e213baf917f"
	//config.SecretKey = "5197AFD043D7B86FDADF912A47FDED22"
	//
	//// flt. 20190305. For spot websocket & restful api test env only
	//config.WSEndpoint = "ws://192.168.80.62:10442/"
	//config.Endpoint = "http://192.168.80.62:8814/"
	//config.ApiKey = "db2a8f85-afa2-48ca-b9f7-5e213baf917f"
	//config.SecretKey = "5197AFD043D7B86FDADF912A47FDED22"

	//
	// flt. 20190306. For account restful api env only
	//config.Endpoint = "http://coinmainweb.new.docker.okex.com/"
	//config.ApiKey = "db2a8f85-afa2-48ca-b9f7-5e213baf917f"
	//config.SecretKey = "5197AFD043D7B86FDADF912A47FDED22"

	// flt. 20190306. For margin restful api env only
	config.Endpoint = "http://192.168.80.118:8814/"
	config.ApiKey = "44dc343e-b32e-4fe3-a5ae-fb6725d2624e"
	config.SecretKey = "DEA612A82517408108D350A6337CCBBE"

	config.Passphrase = "123456"
	config.TimeoutSecond = 45
	config.IsPrint = true
	config.I18n = ENGLISH

	return &config
}

func NewTestClient() *Client {
	// Set OKEX API's config
	client := NewClient(*GetDefaultConfig())
	return client
}
