(defproject makeawish-clojure-backend "0.1.0-SNAPSHOT"
  :description "Make A Wish, backend for wishlist application"
  :url "..."
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [compojure "1.6.1"]
                 [ring/ring-defaults "0.3.2"]
                 [org.clojure/java.jdbc "0.7.11"]
                 [org.clojure/data.json "0.2.3"]]
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler makeawish-clojure-backend.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.2"]]}})
