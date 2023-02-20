import re
import os
import shutil

# out = "./generated_datasets/lang3_test.tests"
# info = "./generated_datasets/lang3_test_info.txt"
# out = "./model_predictions/lang/test_best-bleu.output"
# info = "./generated_datasets/lang3_test_info.txt"
# out = "./model_predictions/lang_nopt/test_best-bleu.output"
# info = "./generated_datasets/lang3_test_info.txt"

# out = "./generated_datasets/time_train.tests"
# info = "./generated_datasets/time_train_info.txt"
# out = "./model_predictions/time/test_best-bleu.output"
# info = "./generated_datasets/time_test_info.txt"
# out = "./model_predictions/time_nopt/test_best-bleu.output"
# info = "./generated_datasets/time_test_info.txt"


# out = "./model_predictions/closure/test_best-bleu.output"
# info = "./generated_datasets/closure_test_info.txt"
# out = "./generated_datasets/closure_train.tests"
# info = "./generated_datasets/closure_train_info.txt"
# out = "./model_predictions/closure_nopt/test_best-bleu.output"
# info = "./generated_datasets/closure_test_info.txt"

# out = "./model_predictions/csv/test_best-bleu.output"
# info = "./generated_datasets/csv_test_info.txt"
# out = "./generated_datasets/csv_train.tests"
# info = "./generated_datasets/csv_train_info.txt"
# out = "./model_predictions/csv_nopt/test_best-bleu.output"
# info = "./generated_datasets/csv_test_info.txt"

# out = "./model_predictions/codec/test_best-bleu.output"
# info = "./generated_datasets/codec_test_info.txt"
# out = "./generated_datasets/codec_train.tests"
# info = "./generated_datasets/codec_train_info.txt"
# out = "./model_predictions/codec_nopt/test_best-bleu.output"
# info = "./generated_datasets/codec_test_info.txt"

# out = "./model_predictions/cli/test_best-bleu.output"
# info = "./generated_datasets/cli_test_info.txt"
# out = "./generated_datasets/cli_train.tests"
# info = "./generated_datasets/cli_train_info.txt"
# out = "./model_predictions/cli_nopt/test_best-bleu.output"
# info = "./generated_datasets/cli_test_info.txt"

# out = "./model_predictions/chart_0/test_best-bleu.output"
# info = "./generated_datasets/chart_test_info_0.txt"
# out = "./generated_datasets/chart_train_0.tests"
# info = "./generated_datasets/chart_train_info_0.txt"
# out = "./model_predictions/chart_nopt_0/test_best-bleu.output"
# info = "./generated_datasets/chart_test_info_0.txt"

# out = "./model_predictions/chart_1/test_best-bleu.output"
# info = "./generated_datasets/chart_test_info_1.txt"
# out = "./generated_datasets/chart_train_1.tests"
# info = "./generated_datasets/chart_train_info_1.txt"

# out = "./model_predictions/jacksonDatabind_0/test_best-bleu.output"
# info = "./generated_datasets/jacksonDatabind_test_info_0.txt"
# out = "./generated_datasets/jacksonDatabind_train_0.tests"
# info = "./generated_datasets/jacksonDatabind_train_info_0.txt"
# out = "./model_predictions/jacksonDatabind_nopt_0/test_best-bleu.output"
# info = "./generated_datasets/jacksonDatabind_test_info_0.txt"

# out = "./model_predictions/jacksonDatabind_1/test_best-bleu.output"
# info = "./generated_datasets/jacksonDatabind_test_info_1.txt"
# out = "./generated_datasets/jacksonDatabind_train_1.tests"
# info = "./generated_datasets/jacksonDatabind_train_info_1.txt"

# out = "./model_predictions/jacksonDatabind_3/test_best-bleu.output"
# info = "./generated_datasets/jacksonDatabind_test_info_3.txt"
# out = "./generated_datasets/jacksonDatabind_train_3.tests"
# info = "./generated_datasets/jacksonDatabind_train_info_3.txt"

# out = "./model_predictions/jacksonDatabind_4/test_best-bleu.output"
# info = "./generated_datasets/jacksonDatabind_test_info_4.txt"
# out = "./generated_datasets/jacksonDatabind_train_4.tests"
# info = "./generated_datasets/jacksonDatabind_train_info_4.txt"

# out = "./model_predictions/jacksonDatabind_2/test_best-bleu.output"
# info = "./generated_datasets/jacksonDatabind_test_info_2.txt"
# out = "./generated_datasets/jacksonDatabind_train_2.tests"
# info = "./generated_datasets/jacksonDatabind_train_info_2.txt"

# out = "./generated_datasets/jacksonDatabind_test_0.tests"
# info = "./generated_datasets/jacksonDatabind_test_info_0.txt"
# out = "./model_predictions/jacksonDatabind_0/jacksonDatabind_comb_0.tests"
# info = "./model_predictions/jacksonDatabind_0/jacksonDatabind_comb_info_0.txt"
# out = "./generated_datasets/jacksonDatabind_comb_0.tests"
# info = "./generated_datasets/jacksonDatabind_comb_info_0.txt"
# out = "./generated_datasets/cli_train.tests"
# info = "./generated_datasets/cli_train_info.txt"


out = "./model_predictions/gson_test_0/prediction/test_best-bleu.output"
info = "./generated_datasets/gson_test_info_0.txt"
# out = "./generated_datasets/gson_train_2.tests"
# info = "./generated_datasets/gson_train_info_2.txt"

# out = "./model_predictions/compress_3/test_best-bleu.output"
# info = "./generated_datasets/compress_test_info_3.txt"
# out = "./generated_datasets/compress_train_3.tests"
# info = "./generated_datasets/compress_train_info_3.txt"

# out = "./model_predictions/jacksonCore_test_0/prediction/test_best-bleu.output"
# info = "./generated_datasets/jacksonCore_test_info_0.txt"
# out = "./generated_datasets/jacksonCore_train_0.tests"
# info = "./generated_datasets/jacksonCore_train_info_0.txt"

# out = "./model_predictions/jacksonCore_test_1/prediction/test_best-bleu.output"
# info = "./generated_datasets/jacksonCore_test_info_1.txt"
# out = "./generated_datasets/jacksonCore_train_1.tests"
# info = "./generated_datasets/jacksonCore_train_info_1.txt"

# out = "./model_predictions/jacksonCore_test_2/prediction/test_best-bleu.output"
# info = "./generated_datasets/jacksonCore_test_info_2.txt"
# out = "./generated_datasets/jacksonCore_train_2.tests"
# info = "./generated_datasets/jacksonCore_train_info_2.txt"

# out = "./model_predictions/jacksonCore_test_3/prediction/test_best-bleu.output"
# info = "./generated_datasets/jacksonCore_test_info_3.txt"
# out = "./generated_datasets/jacksonCore_train_3.tests"
# info = "./generated_datasets/jacksonCore_train_info_3.txt"

# out = "./model_predictions/jacksonCore_test_4/prediction/test_best-bleu.output"
# info = "./generated_datasets/jacksonCore_test_info_4.txt"
# out = "./generated_datasets/jacksonCore_train_4.tests"
# info = "./generated_datasets/jacksonCore_train_info_4.txt"


# out = "./model_predictions/jsoup_test_4/prediction/test_best-bleu.output"
# info = "./generated_datasets/jsoup_test_info_4.txt"
# out = "./generated_datasets/jsoup_train_4.tests"
# info = "./generated_datasets/jsoup_train_info_4.txt"
# out = "./model_predictions/jsoup_test_nopt_0/test_best-bleu.output"
# info = "./generated_datasets/jsoup_test_info_0.txt"


# out = "./model_predictions/jxPath_test_4/prediction/test_best-bleu.output"
# info = "./generated_datasets/jxPath_test_info_4.txt"
# out = "./generated_datasets/jxPath_train_4.tests"
# info = "./generated_datasets/jxPath_train_info_4.txt"
# out = "./model_predictions/jsoup_test_nopt_0/test_best-bleu.output"
# info = "./generated_datasets/jsoup_test_info_0.txt"

# out = "concat.tests"
# info = "concat_info.txt"

def prepare():

    f = open(  out)
    out_lines = f.readlines()
    f.close()

    f = open( info)
    info_lines = f.readlines()
    f.close()

    global i
    i = 0

    def replace(m):
        global i
        i += 1
        test_name = m.group(0).split('(') 
        new_test_name =(str(i)+'(').join(test_name)
        return new_test_name
    
    if os.path.exists("out/"):
        shutil.rmtree("out/")
    test_num  = 0
    list_of_tests = []
    for line, info_line in zip(out_lines, info_lines):
        if line not in list_of_tests:
            list_of_tests.append(line)
            line = re.sub('test\w+\(\)', replace, line)
            if "@Test" not in line:
                if line.startswith('('):
                    line = '@Test' + line
                else:
                    line = '@Test\n' + line
            test_num +=1
            line = re.sub("\[EOL\]", '\n', line)
            path = info_line.split("<test_path>:")[-1].strip()
            os.makedirs(os.path.dirname("out/runnable_tests/" + path), exist_ok=True)
            with open("out/runnable_tests/" + path, "a") as Final_tests:
                Final_tests.write(line)
    print(test_num)    

if __name__ == "__main__":
    prepare()


    
