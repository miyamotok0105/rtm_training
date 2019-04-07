(function (window, $) {
  'use strict';

  $.fn.useSound = function (_event, _id) {
    

    var se = $(_id);
    this.on(_event, function(){
      se[0].currentTime = 0;
      se[0].play();
    });
    return this;
  };

})(this, this.jQuery);


// $('.btn_ng').click(function() {
//     // alert("!");
//     $('.btn_ng').useSound('mousedown touchstart', '#ng_sound');
// });


// $('.btn_ok').click(function() {
//     // alert("!");
//     $('.btn_ok').useSound('mousedown touchstart', '#ok_sound');
// });


// $( document ).ready(function() {
//     anime({
//       targets: '.question',
//       translateX: 270,
//       delay: anime.stagger(100, {start: 500}) // delay starts at 500ms then increase by 100ms for each elements.
//     });
// });


