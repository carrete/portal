(ns portal.resources
  #?(:cljs (:require-macros portal.resources))
  #?(:clj (:require [clojure.java.io :as io])))

#?(:clj
   (defmacro resource [resource-name]
     (slurp (io/resource resource-name))))
