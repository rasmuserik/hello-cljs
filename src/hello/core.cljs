(ns hello.core
  (:require [om.core :as om :include-macros true]
            [sablono.core :as html :refer [html] :include-macros true]))

(om/root
 {}
 (fn [data]
   (om/component
    (html
     [:div.container
      [:div
       {:style
        {:position "absolute"
         :top 10
         :left 100
         :background-color "green"}}
       "wooha"]
      [:div.row
       [:div.col-md-4
        [:h2 "Hello world"]
        [:p
         {:style
          {:background-color "red"}}
         "blah blah blah"]]
       [:div.col-md-4
        [:h2 "Hello 2"]]
       [:div.col-md-4
        [:h2 "Hello 3"]
        [:a.btn.btn-default
         {:href "#" :role "button"}
         "but but but..."]
        ]
       ]])))
 js/document.body)
