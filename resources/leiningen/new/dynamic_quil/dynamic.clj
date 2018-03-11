(ns {{name}}.dynamic
  (:require [quil.core as q])
  (:require [quil.middleware :as m]))

(defn setup []
  (q/frame-rate 30)
  (q/background 0 0 0)
  ; Return the initial state from the setup function.
  {:r 0
   :g 0
   :b 0})

(defn update-state [state]
  {:r (Math/min 255 (+ (:r state) 1))
   :g 0
   :b 0})

(defn draw [state]
  (q/fill (:r state) (:g state) (:b state))
  (q/ellipse 100 100 100 100)
  (use :reload '{{name}}.dynamic)
  )