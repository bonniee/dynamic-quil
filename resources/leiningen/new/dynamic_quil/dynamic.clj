(ns {{name}}.dynamic
  (:require [quil.core :as q]))

(defn update-state [state]
  {:r (Math/min 255 (+ (:r state) 1))
   :g 0
   :b 0})

(defn draw [state]
  (q/fill (:r state) (:g state) (:b state))
  (q/ellipse 100 100 100 100)
  
  ; This line allows us to edit on the fly.
  (use :reload '{{name}}.dynamic))
