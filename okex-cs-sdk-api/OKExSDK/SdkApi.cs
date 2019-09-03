using Newtonsoft.Json.Linq;
using OKExSDK.Models.Error;
using System;
using System.Collections.Generic;
using System.Text;

namespace OKExSDK
{
    public abstract class SdkApi
    {
        protected string BASEURL = "https://www.okex.com/";

        protected string _apiKey;
        protected string _secret;
        protected string _passPhrase;

        public SdkApi(string apiKey, string secret, string passPhrase)
        {
            this._apiKey = apiKey;
            this._secret = secret;
            this._passPhrase = passPhrase;
        }

        public T ToObject<T>(string json) where T : class
        {
            
            var jObject = JObject.Parse(json);
            JToken codeJToken;
            if (jObject.TryGetValue("code", out codeJToken))
            {
                var errorInfo = jObject.ToObject<ErrorResult>();
                throw new OKExResultException(errorInfo);
            }
            var result = jObject.ToObject<T>();
            return result;
        }

        public List<T> ToList<T>(string json) where T : class
        {
            var jArray = JArray.Parse(json);
            
            var result = jArray.ToObject<List<T>>();
            return result;
        }
    }
}
