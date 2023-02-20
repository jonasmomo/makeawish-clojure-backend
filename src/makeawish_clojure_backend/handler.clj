(ns makeawish-clojure-backend.handler
  (:require [compojure.core :refer :all]
            [ring.middleware.defaults :refer [site-defaults wrap-defaults]]
            [clojure.data.json :as json]))

(defn hello-world-handler [request]
  {:status  200
   :headers {"Content-Type" "text/plain"}
   :body    "This is /hello"})

(defn json-handler [request]
  {:status  200
   :headers {"Content-Type" "application/json"}
   :body    (with-out-str (json/pprint {:name "Jonas" :age 29 :city "Oslo"}))
   })

(defroutes app-routes
           (GET "/hello" [] hello-world-handler)
           (GET "/test" [] "This is /test")
           (GET "/json" [] json-handler))

(def app
  (wrap-defaults app-routes site-defaults))
