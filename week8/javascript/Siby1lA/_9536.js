//00:47:43
function solution(case1) {
  const input = case1.split("\n");
  const T = input.shift();
  const END = "what does the fox say?";
  let cnt = 0;
  while (cnt < Number(T)) {
    const foxSound = [];
    let sounds = input[0].trim().split(" ");
    let dict = {};
    input.shift();
    while (true) {
      let animal = input[0].trim();
      input.shift();
      if (animal === END) {
        break;
      }
      dict[animal.split(" ")[2]] = true;
    }
    sounds.map((sound) => {
      foxSound.push(sound);
      if (dict[sound]) foxSound.pop();
    });

    console.log(foxSound.join(" "));
    cnt += 1;
  }
}
const case1 = `1
toot woof wa ow ow ow pa blub blub pa toot pa blub pa pa ow pow toot
dog goes woof
fish goes blub
elephant goes toot
seal goes ow
what does the fox say?`;

solution(case1);
