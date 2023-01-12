# SheepGame


```bash
for x in {0..255}; do echo -e "\033[48;5;${x}mColor　🐑 $x\033[0;0m"; done
```

```bash
# make a sandbox
mkdir tmp$$
cd tmp$$

# downloads scripts
wget https://github.com/robertknight/konsole/raw/master/tests/color-spaces.pl \
     https://gist.github.com/lilydjwg/fdeaf79e921c2f413f44b6f613f6ad53/raw/94d8b2be62657e96488038b0e547e3009ed87d40/colors.py \
     https://github.com/JohnMorales/dotfiles/raw/master/colors/24-bit-color.sh \
     https://gitlab.gnome.org/GNOME/vte/-/raw/master/perf/img.sh

# read the scripts with your editor
$EDITOR *
```

```ec
bash 24-bit-color.sh
perl color-spaces.pl
python colors.py
bash img.sh
```