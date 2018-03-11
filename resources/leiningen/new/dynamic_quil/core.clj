(ns {{name}}.core
  (:require [quil.core :as q])
  (:require [quil.middleware :as m])
  (:require [{{name}}.dynamic :as dynamic]))

(defn setup []
  (q/frame-rate 30)
  (q/background 255 255 255)
  ; Return the initial state from the setup function.
  {:r 0
   :g 0
   :b 0})

(q/defsketch sketch
  :title "My dynamic Quil sketch"
  :setup setup
  :draw dynamic/draw
  :update dynamic/update-state
  :middleware [m/fun-mode]
  :size [500 500])

(defn -main []
  sketch)
