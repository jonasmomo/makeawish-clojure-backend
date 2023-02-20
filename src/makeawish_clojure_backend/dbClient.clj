(ns makeawish-clojure-backend.dbClient
  (:require [clojure.java.jdbc :as jdbc]))

(def db-spec {:classname   "org.postgresql.Driver"
              :subprotocol "postgresql"
              :subname     "//localhost:5432/mydatabase"
              :user        "myusername"
              :password    "mypassword"})

(def db (jdbc/get-database db-spec))

